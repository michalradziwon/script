
  package gen;
  public class O_Gen14 {
  		@com.google.inject.Inject
  		public O_Gen14(O_Gen15 o_gen15){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen15 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  