
  package gen;
  public class D_Gen175 {
  		@com.google.inject.Inject
  		public D_Gen175(D_Gen176 d_gen176){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen176 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  