
  package gen;
  public class D_Gen17 {
  		@com.google.inject.Inject
  		public D_Gen17(D_Gen18 d_gen18){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen18 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  