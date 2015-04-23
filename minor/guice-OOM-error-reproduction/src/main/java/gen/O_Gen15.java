
  package gen;
  public class O_Gen15 {
  		@com.google.inject.Inject
  		public O_Gen15(O_Gen16 o_gen16){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen16 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  