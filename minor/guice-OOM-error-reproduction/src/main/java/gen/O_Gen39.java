
  package gen;
  public class O_Gen39 {
  		@com.google.inject.Inject
  		public O_Gen39(O_Gen40 o_gen40){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen40 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  