
  package gen;
  public class D_Gen124 {
  		@com.google.inject.Inject
  		public D_Gen124(D_Gen125 d_gen125){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen125 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  