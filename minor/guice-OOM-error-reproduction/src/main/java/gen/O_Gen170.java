
  package gen;
  public class O_Gen170 {
  		@com.google.inject.Inject
  		public O_Gen170(O_Gen171 o_gen171){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen171 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  