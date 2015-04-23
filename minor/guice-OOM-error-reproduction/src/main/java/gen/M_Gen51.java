
  package gen;
  public class M_Gen51 {
  		@com.google.inject.Inject
  		public M_Gen51(M_Gen52 m_gen52){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen52 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  