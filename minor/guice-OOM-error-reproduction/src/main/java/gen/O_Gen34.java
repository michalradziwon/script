
  package gen;
  public class O_Gen34 {
  		@com.google.inject.Inject
  		public O_Gen34(O_Gen35 o_gen35){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen35 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  