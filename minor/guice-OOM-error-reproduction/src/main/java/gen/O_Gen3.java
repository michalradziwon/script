
  package gen;
  public class O_Gen3 {
  		@com.google.inject.Inject
  		public O_Gen3(O_Gen4 o_gen4){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen4 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  