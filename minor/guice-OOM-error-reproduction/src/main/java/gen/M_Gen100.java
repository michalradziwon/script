
  package gen;
  public class M_Gen100 {
  		@com.google.inject.Inject
  		public M_Gen100(M_Gen101 m_gen101){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen101 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  