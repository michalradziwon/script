
  package gen;
  public class O_Gen72 {
  		@com.google.inject.Inject
  		public O_Gen72(O_Gen73 o_gen73){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen73 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  