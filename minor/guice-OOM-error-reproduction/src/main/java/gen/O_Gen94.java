
  package gen;
  public class O_Gen94 {
  		@com.google.inject.Inject
  		public O_Gen94(O_Gen95 o_gen95){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen95 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  