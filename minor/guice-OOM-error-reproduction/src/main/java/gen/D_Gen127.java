
  package gen;
  public class D_Gen127 {
  		@com.google.inject.Inject
  		public D_Gen127(D_Gen128 d_gen128){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen128 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  