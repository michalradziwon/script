
  package gen;
  public class T_Gen49 {
  		@com.google.inject.Inject
  		public T_Gen49(T_Gen50 t_gen50){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen50 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  