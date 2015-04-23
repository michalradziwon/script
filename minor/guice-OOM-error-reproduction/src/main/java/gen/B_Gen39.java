
  package gen;
  public class B_Gen39 {
  		@com.google.inject.Inject
  		public B_Gen39(B_Gen40 b_gen40){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen40 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  