
  package gen;
  public class F_Gen34 {
  		@com.google.inject.Inject
  		public F_Gen34(F_Gen35 f_gen35){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen35 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  