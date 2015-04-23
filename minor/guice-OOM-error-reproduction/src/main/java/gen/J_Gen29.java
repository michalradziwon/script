
  package gen;
  public class J_Gen29 {
  		@com.google.inject.Inject
  		public J_Gen29(J_Gen30 j_gen30){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen30 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  