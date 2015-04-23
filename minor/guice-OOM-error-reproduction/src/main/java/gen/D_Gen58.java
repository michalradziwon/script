
  package gen;
  public class D_Gen58 {
  		@com.google.inject.Inject
  		public D_Gen58(D_Gen59 d_gen59){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen59 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  