
  package gen;
  public class S_Gen14 {
  		@com.google.inject.Inject
  		public S_Gen14(S_Gen15 s_gen15){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen15 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  