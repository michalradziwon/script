
  package gen;
  public class J_Gen194 {
  		@com.google.inject.Inject
  		public J_Gen194(J_Gen195 j_gen195){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen195 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  