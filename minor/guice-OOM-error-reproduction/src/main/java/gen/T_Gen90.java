
  package gen;
  public class T_Gen90 {
  		@com.google.inject.Inject
  		public T_Gen90(T_Gen91 t_gen91){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen91 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  