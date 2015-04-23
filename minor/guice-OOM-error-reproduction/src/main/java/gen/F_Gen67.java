
  package gen;
  public class F_Gen67 {
  		@com.google.inject.Inject
  		public F_Gen67(F_Gen68 f_gen68){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen68 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  