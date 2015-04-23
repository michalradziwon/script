
  package gen;
  public class F_Gen15 {
  		@com.google.inject.Inject
  		public F_Gen15(F_Gen16 f_gen16){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen16 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  