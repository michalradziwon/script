
  package gen;
  public class O_Gen101 {
  		@com.google.inject.Inject
  		public O_Gen101(O_Gen102 o_gen102){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen102 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  