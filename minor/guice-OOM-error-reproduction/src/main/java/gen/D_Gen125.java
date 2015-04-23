
  package gen;
  public class D_Gen125 {
  		@com.google.inject.Inject
  		public D_Gen125(D_Gen126 d_gen126){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen126 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  