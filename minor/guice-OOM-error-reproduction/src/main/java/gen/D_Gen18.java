
  package gen;
  public class D_Gen18 {
  		@com.google.inject.Inject
  		public D_Gen18(D_Gen19 d_gen19){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen19 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  