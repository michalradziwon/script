
  package gen;
  public class J_Gen124 {
  		@com.google.inject.Inject
  		public J_Gen124(J_Gen125 j_gen125){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen125 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  