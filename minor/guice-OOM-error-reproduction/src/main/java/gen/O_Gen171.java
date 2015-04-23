
  package gen;
  public class O_Gen171 {
  		@com.google.inject.Inject
  		public O_Gen171(O_Gen172 o_gen172){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen172 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  