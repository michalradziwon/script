
  package gen;
  public class D_Gen85 {
  		@com.google.inject.Inject
  		public D_Gen85(D_Gen86 d_gen86){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen86 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  