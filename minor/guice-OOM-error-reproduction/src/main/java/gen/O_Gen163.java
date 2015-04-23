
  package gen;
  public class O_Gen163 {
  		@com.google.inject.Inject
  		public O_Gen163(O_Gen164 o_gen164){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen164 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  