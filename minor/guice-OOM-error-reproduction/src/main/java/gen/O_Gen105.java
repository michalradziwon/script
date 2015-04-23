
  package gen;
  public class O_Gen105 {
  		@com.google.inject.Inject
  		public O_Gen105(O_Gen106 o_gen106){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen106 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  