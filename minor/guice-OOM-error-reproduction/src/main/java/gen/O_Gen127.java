
  package gen;
  public class O_Gen127 {
  		@com.google.inject.Inject
  		public O_Gen127(O_Gen128 o_gen128){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen128 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  