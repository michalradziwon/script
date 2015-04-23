
  package gen;
  public class O_Gen114 {
  		@com.google.inject.Inject
  		public O_Gen114(O_Gen115 o_gen115){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen115 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  