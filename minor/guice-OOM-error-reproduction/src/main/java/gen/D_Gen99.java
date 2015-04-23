
  package gen;
  public class D_Gen99 {
  		@com.google.inject.Inject
  		public D_Gen99(D_Gen100 d_gen100){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen100 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  