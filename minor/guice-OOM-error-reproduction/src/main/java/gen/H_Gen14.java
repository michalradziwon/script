
  package gen;
  public class H_Gen14 {
  		@com.google.inject.Inject
  		public H_Gen14(H_Gen15 h_gen15){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen15 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  