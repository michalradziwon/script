
  package gen;
  public class O_Gen168 {
  		@com.google.inject.Inject
  		public O_Gen168(O_Gen169 o_gen169){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen169 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  