
  package gen;
  public class O_Gen33 {
  		@com.google.inject.Inject
  		public O_Gen33(O_Gen34 o_gen34){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen34 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  