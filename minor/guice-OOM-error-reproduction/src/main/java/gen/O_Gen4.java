
  package gen;
  public class O_Gen4 {
  		@com.google.inject.Inject
  		public O_Gen4(O_Gen5 o_gen5){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen5 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  