
  package gen;
  public class T_Gen162 {
  		@com.google.inject.Inject
  		public T_Gen162(T_Gen163 t_gen163){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen163 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  