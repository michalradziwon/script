
  package gen;
  public class B_Gen14 {
  		@com.google.inject.Inject
  		public B_Gen14(B_Gen15 b_gen15){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen15 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  