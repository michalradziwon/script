
  package gen;
  public class O_Gen113 {
  		@com.google.inject.Inject
  		public O_Gen113(O_Gen114 o_gen114){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen114 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  