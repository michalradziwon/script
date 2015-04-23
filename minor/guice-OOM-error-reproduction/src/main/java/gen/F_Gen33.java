
  package gen;
  public class F_Gen33 {
  		@com.google.inject.Inject
  		public F_Gen33(F_Gen34 f_gen34){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen34 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  