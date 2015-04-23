
  package gen;
  public class O_Gen48 {
  		@com.google.inject.Inject
  		public O_Gen48(O_Gen49 o_gen49){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen49 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  