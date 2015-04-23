
  package gen;
  public class J_Gen184 {
  		@com.google.inject.Inject
  		public J_Gen184(J_Gen185 j_gen185){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen185 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  