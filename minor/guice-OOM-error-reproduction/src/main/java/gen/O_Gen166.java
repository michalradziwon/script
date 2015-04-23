
  package gen;
  public class O_Gen166 {
  		@com.google.inject.Inject
  		public O_Gen166(O_Gen167 o_gen167){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen167 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  