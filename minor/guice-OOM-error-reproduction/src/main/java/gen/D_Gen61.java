
  package gen;
  public class D_Gen61 {
  		@com.google.inject.Inject
  		public D_Gen61(D_Gen62 d_gen62){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen62 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  