
  package gen;
  public class T_Gen101 {
  		@com.google.inject.Inject
  		public T_Gen101(T_Gen102 t_gen102){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen102 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  