
  package gen;
  public class F_Gen55 {
  		@com.google.inject.Inject
  		public F_Gen55(F_Gen56 f_gen56){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen56 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  