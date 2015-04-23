
  package gen;
  public class O_Gen61 {
  		@com.google.inject.Inject
  		public O_Gen61(O_Gen62 o_gen62){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen62 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  