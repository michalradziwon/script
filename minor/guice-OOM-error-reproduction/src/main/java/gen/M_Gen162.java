
  package gen;
  public class M_Gen162 {
  		@com.google.inject.Inject
  		public M_Gen162(M_Gen163 m_gen163){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen163 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  