
  package gen;
  public class M_Gen170 {
  		@com.google.inject.Inject
  		public M_Gen170(M_Gen171 m_gen171){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen171 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  