
  package gen;
  public class T_Gen94 {
  		@com.google.inject.Inject
  		public T_Gen94(T_Gen95 t_gen95){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen95 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  