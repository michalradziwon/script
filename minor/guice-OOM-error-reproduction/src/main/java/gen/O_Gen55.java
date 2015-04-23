
  package gen;
  public class O_Gen55 {
  		@com.google.inject.Inject
  		public O_Gen55(O_Gen56 o_gen56){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen56 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  