
  package gen;
  public class O_Gen194 {
  		@com.google.inject.Inject
  		public O_Gen194(O_Gen195 o_gen195){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen195 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  